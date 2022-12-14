/**
 * Descripcion
 * @author Fernando Lago Novoa
 * @version 23.11.2022
 */
public class Main {
    public static void main(String[] args) {
        Perro animal = new Perro();
        //animal.pelo="corto"; // Al cambiar los atributos de la clase perro a private, en el Main.java no nos deja acceder a dicha clase.
        //animal.color="negro";
        //animal.chip=15;

        animal.setPelo("largo");
        animal.setChip(50);
        animal.setColor("marron");
        animal.setAltura(20);
        animal.setPeso(48);

        //Scanner dato = new Scanner(System.in);
        //System.out.println("indica el peso del animal");
        //animal.setPeso(dato.nextInt());
        //System.out.println("indica la altura del animal");
        //animal.setAltura(dato.nextInt());

        //animal.ladrar();

        Perro animal_2=new Perro();
        animal_2.setPelo("corto");
        animal_2.setChip(5);
        animal_2.setColor("negro");
        animal_2.setAltura(20);
        animal_2.setPeso(48);

        Perro animal_3=new Perro();
        animal_3.setPelo("rizado");
        animal_3.setChip(19);
        animal_3.setColor("blanco");
        animal_3.setAltura(4);
        animal_3.setPeso(3);

        Perro[] ladrido_animal = new Perro[3];
        ladrido_animal [0] = animal;
        ladrido_animal [1] = animal_2;
        ladrido_animal [2] = animal_3;

        for (int i=0;i< ladrido_animal.length;i++){
            System.out.println(Perro.ladrar(ladrido_animal[i].getAltura(),ladrido_animal[i].getPeso()));
        }


    }
}