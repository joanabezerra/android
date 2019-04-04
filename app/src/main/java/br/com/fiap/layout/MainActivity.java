package br.com.fiap.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ExmploLinearLayout(View view) {
        Toast.makeText(this, R.string.mensagem, Toast.LENGTH_SHORT).show();
    }

    public void emxemploRelativeLayout(View view) {
        Intent it = new Intent(this, exmploRelativeLayoutActivity.class);
        startActivity(it);
    }

    public void ExemploAbsoluteLayout(View view) {
        Intent it = new Intent(this, ExemploAbsoluteLayoutActivity.class);
        startActivity(it);
    }

    public void ExmploFrameLayoutActivity(View view) {
        Intent it = new Intent(this, ExmploFrameLayoutActivity.class);
        startActivity(it);
    }
}
