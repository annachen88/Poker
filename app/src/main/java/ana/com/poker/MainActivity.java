package ana.com.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Poker poker = new Poker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new PokerAdapter());
    }
   class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PokerHolder>{

       @NonNull
       @Override
       public PokerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
           View view = getLayoutInflater().inflate(R.layout.poker,viewGroup,false);
           return new PokerHolder(view);
       }

       @Override
       public void onBindViewHolder(@NonNull PokerHolder pokerHolder, int i) {
        pokerHolder.pokerView.setText(poker.cards[i].get());
       }

       @Override
       public int getItemCount() {
           return poker.cards.length;
       }

       class PokerHolder extends RecyclerView.ViewHolder{
            TextView pokerView;
            public PokerHolder(@NonNull View itemView) {
                super(itemView);
                pokerView = itemView.findViewById(R.id.textView);

            }
        }
    }
}
