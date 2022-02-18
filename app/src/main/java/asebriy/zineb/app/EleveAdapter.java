package asebriy.zineb.app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class EleveAdapter extends RecyclerView.Adapter<EleveAdapter.ViewHolder>{

    public static final String BASE_URL = "https://image.tmdb.org/t/p/w500";
    private final List<Eleve> eleves;

    public EleveAdapter(List<Eleve> leleves){
        eleves = leleves;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieview = inflater.inflate(R.layout.item_eleve,parent, false);
        return new ViewHolder(movieview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Eleve eleve = eleves.get(position);
        ImageView image = holder.image;

        TextView nom = holder.nom;
        nom.setText(eleve.getNom());

        TextView email = holder.email;
        email.setText(eleve.getEmail());

        TextView telephone = holder.telephone;
        telephone.setText(eleve.getTelephone());
/*

        Glide.with(holder.itemView).load(BASE_URL+movie.getPoster_path()).into(image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MovieDetails.class);
                intent.putExtra("movie",movie);
                context.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return eleves.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView nom;
        public TextView email;
        public TextView telephone;

        public ViewHolder(View itemView){
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            nom = (TextView) itemView.findViewById(R.id.nom);
            email = itemView.findViewById(R.id.email);
            telephone = itemView.findViewById(R.id.telephone);

        }
    }
}
