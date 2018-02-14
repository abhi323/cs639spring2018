package com.pace.cs639spring.hw2.cs639springhw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int addBtnPosition= -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureListView();
    }

    private void configureListView() {
        final ListView listView = findViewById(R.id.listView);
        final Button addButton = (Button) findViewById(R.id.addBtn);
        final List<ListViewObject> animalListView =  new ArrayList<>();
        String bird="I am a bird";
        String dog= "I am dog";
        String elephant= "I am Elephant";
        String tiger ="I am tiger";
        String lion= "I am lion";
        String monkey= "I am monkey";
        String snake ="I am  snake";
        String giraffe ="I am giraffe";
        String cow=" I am a cow";
        String pig ="I am pig";

        animalListView.add(new ListViewObject(R.drawable.bird, animalDescList(bird)));
        animalListView.add(new ListViewObject(R.drawable.dog, animalDescList(dog)));
        animalListView.add(new ListViewObject(R.drawable.snake, animalDescList(snake)));
        animalListView.add(new ListViewObject(R.drawable.cow, animalDescList(cow)));
        animalListView.add(new ListViewObject(R.drawable.pig, animalDescList(pig)));
        animalListView.add(new ListViewObject(R.drawable.giraffe, animalDescList(giraffe)));
        animalListView.add(new ListViewObject(R.drawable.hati, animalDescList(elephant)));
        animalListView.add(new ListViewObject(R.drawable.monkey, animalDescList(monkey)));
        animalListView.add(new ListViewObject(R.drawable.t, animalDescList(tiger)));
        animalListView.add(new ListViewObject(R.drawable.lion, animalDescList(lion)));

        final AnimalDisplayListViewAdapter adapter = new AnimalDisplayListViewAdapter(this, animalListView);
        listView.setAdapter(adapter);
       addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(addBtnPosition>=0){
                    animalListView.get(addBtnPosition).position= addBtnPosition;
                    EditText ed= (EditText) findViewById(R.id.factDescription);
                    ListViewObject aList = (ListViewObject) animalListView.get(addBtnPosition);
                    aList.mNames.add(ed.getText().toString());
                    Toast.makeText(MainActivity.this,"The Fact has been added",Toast.LENGTH_LONG).show();
                    //adapter.notifyDataSetChanged();
                }else if (addBtnPosition<0){
                    Toast.makeText(MainActivity.this,"Select Image First",Toast.LENGTH_LONG).show();
                }
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (ListViewObject lv: animalListView){
                        lv.setSelected(false);
                }
                addBtnPosition = position;
                animalListView.get(position).setSelected(true);
                adapter.notifyDataSetChanged();
            }
        });
    }

    private List animalDescList(String str) {
        ArrayList<String> animalDescList = new ArrayList<String>(Arrays.asList(str));
        return animalDescList;
    }
}
