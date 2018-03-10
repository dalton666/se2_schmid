package com.example.timos.palindromchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*Called when the user taps the Send button */
    public void checkPalindrom(View view) {
        System.out.println("Klick");
        EditText editText = findViewById(R.id.palindromInput);
        // R.id ist eine Standard Android Funktion,
        //mit Hilfe der man auf die UI Komponenten zugegriffen werden kann
        System.out.println(editText.getText());
        TextView msLabel = findViewById(R.id.msLabel);

        String inputString = editText.getText().toString();
        if(inputString != null && !inputString.trim().equals("")) {
            /*Überprüft ob iputstring gleich null oder leer, trim löscht leerzeichen davor und danach weg */
            if (inputString.length() >= 5) {
                if(isPalindrome(inputString.toLowerCase())){ /* to Lower Case Groß Kleinschreibung */
                    msLabel.setText("Is Palindrom");
                }
                else{
                    msLabel.setText("Is not Palindrom");
                }

            } else {
                msLabel.setText("Bitte mind 5 Zeichen eingeben!");
            }
        }
        else{
            msLabel.setText("Bitte Text eingeben!");
        }
    }
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
        /*Überprüft ob str von vorne und hinten gleich ist*/
    }
}
