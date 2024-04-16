package desafio.musicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println("As melhores!");
        }
        else {
            System.out.println("Médias ");
        }
    }
}
