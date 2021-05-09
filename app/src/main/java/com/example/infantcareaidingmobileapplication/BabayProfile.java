package com.example.infantcareaidingmobileapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BabayProfile extends AppCompatActivity {

    TextView bname,dob,genber,weight;
    Button btn;
    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babay_profile);

        bname=(TextView)findViewById(R.id.babyprofn);
        dob=(TextView)findViewById(R.id.babyprofdob);
        genber=(TextView)findViewById(R.id.babyprofgender);
        weight=(TextView)findViewById(R.id.babyprofweight);
        btn=(Button)findViewById(R.id.babyprofshow);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff= FirebaseDatabase.getInstance().getReference("Baby").child(FirebaseAuth.getInstance().getCurrentUser().getUid());
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String bbname = snapshot.child("bname").getValue().toString();
                        String bbdob = snapshot.child("dob").getValue().toString();
                        String bbgender=snapshot.child("gender").getValue().toString();
                        String bbweight = snapshot.child("weight").getValue().toString();

                        bname.setText(bbname);
                        dob.setText(bbdob);
                        genber.setText(bbgender);
                        weight.setText(bbweight);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });


    }
}