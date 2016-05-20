package id.semmi.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AppCompatButton popularMovies;
    private AppCompatButton stockHawk;
    private AppCompatButton buildIt;
    private AppCompatButton material;
    private AppCompatButton ubiquitous;
    private AppCompatButton capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popularMovies = (AppCompatButton) findViewById(R.id.popularMovie);
        stockHawk = (AppCompatButton) findViewById(R.id.stockHawk);
        buildIt = (AppCompatButton) findViewById(R.id.buildIt);
        material = (AppCompatButton) findViewById(R.id.material);
        ubiquitous = (AppCompatButton) findViewById(R.id.ubiquitous);
        capstone = (AppCompatButton) findViewById(R.id.capstone);

        popularMovies.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        buildIt.setOnClickListener(this);
        material.setOnClickListener(this);
        ubiquitous.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.popularMovie:
                Toast.makeText(MainActivity.this, "This Button will launch my Popular Movie App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stockHawk:
                Toast.makeText(MainActivity.this, "This Button will launch my Stock Hawk App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildIt:
                Toast.makeText(MainActivity.this, "This Button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ubiquitous:
                Toast.makeText(MainActivity.this, "This Button will launch my Go Ubiquitous App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this, "This Button will launch my Capstone App", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
