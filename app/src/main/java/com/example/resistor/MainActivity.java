package com.example.resistor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double selectedBand = 0;
    double resValue = 0;
  TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.result);

    }

    public void bOne (View view) {
        selectedBand = 1;
    }
    public void bTwo (View view) {
        selectedBand = 2;
    }
    public void bThree (View view) {
        selectedBand = 3;
    }
    public void bFour (View view) {
        selectedBand = 4;
    }

    public void addBlack (View View) {
        if (selectedBand == 1) {
            resValue = 0;
    } else if(selectedBand == 2) {
            resValue = resValue * 10 + 0;
        } else if (selectedBand == 3) {
            resValue = resValue * 1;
        }
        }
    public void addBrown (View View) {
        if (selectedBand == 1) {
            resValue = 1;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 1;
        } else if (selectedBand == 3) {
            resValue = resValue * 10;
        }
    }
    public void addRed (View View) {
        if (selectedBand == 1) {
            resValue = 2;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 2;
        } else if (selectedBand == 3) {
            resValue = resValue * 100;
        }
    }
    public void addOrange (View View) {
        if (selectedBand == 1) {
            resValue = 3;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 3;
        } else if (selectedBand == 3) {
            resValue = resValue * 1000;
        }
    }
    public void addYellow (View View) {
        if (selectedBand == 1) {
            resValue = 4;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 4;
        } else if (selectedBand == 3) {
            resValue = resValue * 10000;
        }
    }
    public void addGreen (View View) {
        if (selectedBand == 1) {
            resValue = 5;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 5;
        } else if (selectedBand == 3) {
            resValue = resValue * 100000;
        }
    }
    public void addBlue (View View) {
        if (selectedBand == 1) {
            resValue = 6;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 6;
        } else if (selectedBand == 3) {
            resValue = resValue * 1000000;
        }
    }
    public void addPurple (View View) {
        if (selectedBand == 1) {
            resValue = 7;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 7;
        } else if (selectedBand == 3) {
            resValue = resValue * 10000000;
        }
    }
    public void addGrey (View View) {
        if (selectedBand == 1) {
            resValue = 8;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 8;
        } else if (selectedBand == 3) {
            resValue = resValue * 100000000;
        }
    }
    public void addWhite (View View) {
        if (selectedBand == 1) {
            resValue = 9;
        }else if(selectedBand == 2) {
            resValue = resValue * 10 + 9;
        } else if (selectedBand == 3) {
            resValue = resValue * 1000000000;
        }
    }
    public void addGold (View View) {
        if (selectedBand == 3) {
            resValue = 0.1;
        }
    }
    public void addSilver (View View){
        if (selectedBand == 3)
            resValue = 0.01;
    }
        public void calculateResistance (View View) {
            display.setText((resValue) + "K ohm");
    }
    public void resetCalculations (View View) {
        display.setText("");
    }

    }
