import java.util.ArrayList;

public class MediadorConcreto implements Mediador {
    private ArrayList<Colega> colegas = new ArrayList<>();

    @Override
    public void Registrar(Colega colega) {
        if (colegas.contains(colega)) return;
        colegas.add(colega);
        colega.setMediador(this);
    }

    @Override
    public void Reenvia(Colega hablante) {
        for (Colega colega: colegas)
            if (! hablante.equals(colega))
                colega.recibe();
    }
}
