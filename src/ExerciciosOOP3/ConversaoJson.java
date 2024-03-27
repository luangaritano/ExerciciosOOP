package ExerciciosOOP3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJson {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();

        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);


    }

}
