package com.hackathon.quackhacks.views;

import android.content.Context;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.hackathon.quackhacks.R;
import com.hackathon.quackhacks.backend.Recipe;
import com.hackathon.quackhacks.backend.UserAccount;

import org.w3c.dom.Text;

import java.util.List;

public class RecipeView extends BaseView {

    public RecipeView(Context context, String user, Recipe recipe) {
        super(context);
        activity.setContentView(R.layout.recipedisplay);

        TextView recipeTitle = activity.findViewById(R.id.recipetitle);
        recipeTitle.setText(recipe.getTitle());

        TextView description = activity.findViewById(R.id.description);
        description.setText(recipe.getDescription());

        TextView ingredients = activity.findViewById(R.id.ingredients);
        List<String> ing = recipe.getIngredients();

        for(int i = 0; i < ing.size(); i++)
        {
            ingredients.setText(ingredients.getText().toString() + ing.get(i) + "\n");
        }

    }
}
