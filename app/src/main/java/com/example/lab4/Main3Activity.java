package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView t1;

    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1= (TextView) findViewById(R.id.textView1);

                Intent i = getIntent();

        name=i.getStringExtra("name_key");
        t1.setText(name);
    }
    public void openMail(View view)
    {

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("email"));
        String[] s={"aryasingh952553@gmail.com",""};
        i.putExtra(Intent.EXTRA_EMAIL,s);
        i.putExtra(Intent.EXTRA_SUBJECT,"Subject");
        i.putExtra(Intent.EXTRA_TEXT,"");
        i.setType("message/rfc822");//setting MIME Email Multipurpose Internet Mail Extensions
        Intent chooser = Intent.createChooser(i,"Launch Email");
        startActivity(chooser);

    }

    public void openMaps(View view)
    {
       Uri uri=Uri.parse("https://maps.google.com");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
       startActivity(intent);
    }

    public void openCall(View view)
    {
        Uri uri=Uri.parse("tel:7762916300");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);

    }

    public void openBrowser(View view)
    {
        Uri uri=Uri.parse("https://www.google.com/search?rlz=1C1CHBF_enIN870IN870&sxsrf=ACYBGNSZ34oHMuEp5vwcdTa0krjRKhyuYg%3A1575389386847&ei=yojmXbakM8O1rQGCtLWADA&q=android+tutorial&oq=android+tutorial&gs_l=psy-ab.3..35i39j0i20i263l2j0j0i67j0l4j0i67.317256.318745..320103...0.2..1.225.1236.3j6j1......0....1..gws-wiz.......0i71j0i22i30j0i22i10i30.dmh6C7alOm0&ved=0ahUKEwi2saTm7pnmAhXDWisKHQJaDcAQ4dUDCAs&uact=5");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
