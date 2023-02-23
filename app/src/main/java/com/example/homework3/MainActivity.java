package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int childTicket = 11;
    int discauntChildTicket = 50;

    int pensionerTicket = 5;
    int dicauntPensionerTicet = 30;

    int adultTicket = 9;
    int pticeadultTicket = 70;

    String whereIsItFlyingTo = "ГорноАлтайска в Артыбаш";
    String time = " 7.00 1 июня (время пути 4 часа 30 минут)";

    private int priceForAdult(){

        int priceForAdult = adultTicket*pticeadultTicket;
        return priceForAdult;
    }

    private int priceForPensioner() {
        int priceForPensioner = pensionerTicket * pticeadultTicket * (100 - dicauntPensionerTicet) / 100;
        return priceForPensioner;
    }

    private int priceForChild() {
        int priceForChild = childTicket*pticeadultTicket*(100-discauntChildTicket)/100;
        return  priceForChild;

    }
    private int priceForEverything(){
        int priceForEverything = priceForAdult() + priceForPensioner() + priceForChild();
                return priceForEverything;
    }

    private TextView dataChild;
    private TextView dataPensioner;
    private TextView dataAdult;
    private TextView dataEverything;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataChild = findViewById(R.id.dataChild);
        dataPensioner = findViewById(R.id.dataPensioner);
        dataAdult = findViewById(R.id.dataAdult);
        dataEverything = findViewById(R.id.dataEverything);

        dataEverything.setText("Стоит"+priceForEverything());
        dataAdult.setText("Стоит"+priceForAdult());
        dataChild.setText("Стоит"+priceForChild());
        dataPensioner.setText("Стоит"+priceForPensioner());








    }
}