package com.example.pdf2;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    public PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("JPA_Mini_Book.pdf").defaultPage(1)
                .spacing(10)
                .load();
    }
    public void nextPage(View view)
    {
        pdfView.jumpTo(pdfView.getCurrentPage()+1,true);
    }
    public void prevPage(View view)
    {
        pdfView.jumpTo(pdfView.getCurrentPage()-1,true);
    }
}
