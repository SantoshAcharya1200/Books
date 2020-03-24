package com.example.santos.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        myPDFViewer = findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("1984")){
            myPDFViewer.fromAsset("1984.pdf").load();
        }
        if(getItem.equals("Anthony_Robbins_Awaken_the_Giant_Within")){
            myPDFViewer.fromAsset("Anthony_Robbins_Awaken_the_Giant_Within.pdf").load();
        }
        if(getItem.equals("Astrophysics For People In A Hurry by Neil deGrasse Tyson")){
            myPDFViewer.fromAsset("Astrophysics For People In A Hurry by Neil deGrasse Tyson.pdf").load();
        }
        if(getItem.equals("BraveNewWorld")){
            myPDFViewer.fromAsset("BraveNewWorld.pdf").load();
        }
        if(getItem.equals("kafka on the shore")){
            myPDFViewer.fromAsset("kafka on the shore.pdf").load();
        }
        if(getItem.equals("Wings of fire")){
            myPDFViewer.fromAsset("Wings of fire.pdf").load();
        }

    }
}
