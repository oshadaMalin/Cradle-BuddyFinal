package com.example.infantcareaidingmobileapplication;

import android.content.Context;

import com.google.firebase.auth.FirebaseAuth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}
/*
@RunWith(MockitoJUnitRunner.class)
public class LoginUnitTest {
    private FirebaseAuth Fauth;
    Fauth = FirebaseAuth.getInstance();
    private static final String FAKE_STRING = "Login was successful";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {

        LogingActivity myObjectUnderTest = new LogingActivity(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest. Fauth.signInWithEmailAndPassword("user","user");

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }

}*/