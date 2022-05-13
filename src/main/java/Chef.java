import java.util.ArrayList;

public class Chef {
    private String recipe;
    private int price;
    protected ArrayList<Chef>  recipeList = new ArrayList<>();

    public Chef(String recipe, int price) {
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void newRecipe(String recipe, int price) {
        boolean contains = false;
        for (Chef chef : recipeList) {
            if (chef.equals(recipe)) {
                contains = true;
            }
        }
        if (!contains) {
            recipeList.add(new Chef(recipe,price));
        }
    }
    public void removeRecipe(String recipe){
        for (Chef chef : recipeList) {
            if (chef.equals(recipe)) {
                recipeList.remove(recipe);
            }
        }
    }
    public String getMenu(){
        String result = "";
        for (int i = 0; i < recipeList.size(); i++) {
            result += recipeList.get(i).getRecipe() + " " + recipeList.get(i).getPrice();
            if (i < recipeList.size() - 1) {
                result += "\r\n";
            }
        }
        return result;
    }
}
