import java.io.*; //importer toutes les classes du package java.io

public class Main {
    public static void main(String[] args) {

        File file1 = new File("fluxEtIHM_Java/myFile.txt");
        File file2 = new File("fluxEtIHM_Java/myFile.docx");


        if(file1.exists()){
            System.out.println("Le fichier existe et son nom est: "+file1.getName());
        }else{
            System.out.println("Le fichier n'existe pas");
        }

        //File directory = new File("Mon repertoire");
        //directory.mkdir();

        System.out.println("le chemin absolu du fichier est "+file1.getAbsolutePath());
        System.out.println("es-ce un repertoire? "+file1.isDirectory());
        System.out.println("est-ce un fichier? "+file1.isFile());

        //input and output streams
        try {

            byte [] buffer = new byte [1024]; //tableau d'octets lus
            int n = 0; //contiendra le nombre d'octets lus a chaque iteration, n=-1 si pas d'octets a lire

            FileInputStream fluxLecture = new FileInputStream(file1);
            FileOutputStream fluxEcriture = new FileOutputStream(file2);

            while ((n =  fluxLecture.read(buffer)) != -1){

                //convertir les octets en chaine de caractere
                String texte = new String(buffer, 0,n);

                //afficher le texte a l'ecran
                System.out.println(texte);

                fluxEcriture.write(buffer,0,n);


            }



            fluxLecture.close();
            fluxEcriture.close();

            //SIMPLER WAY
            //ici si le fichier n'existe pas il sera cree automatiquement
            //FileOutputStream fluxEcriture = new FileOutputStream(file2);

            //String texte = "Comment tu vas?";

            //convertir ce texte en octets
            //fluxEcriture.write(texte.getBytes());

            //fluxEcriture.close();
            //LECTURE ET ECRITURE DES OBJETS AVEC OBJECTINPUTSTREAN AND OBJECTOUTPUTSTREAM (serialisation)

            Voituree voiture = new Voituree(5, 6, "suzuki");
            //1. ecriture de l'object
            ObjectOutputStream fluxEcritureObject = new ObjectOutputStream(new FileOutputStream(new File("fluxEtIHM_Java/myFileO.txt")));
            fluxEcritureObject.writeObject(voiture);

            //2. lecture de l'object
            ObjectInputStream fluxLectureObject = new ObjectInputStream(new FileInputStream(new File("myFileO.txt")));
            System.out.println(((Voituree) fluxLectureObject.readObject()).description());//on convertit en voiture car lors de la lecture
            //on perd la notion de type d'object



    
        } catch (IOException e) {
            // TODO: handle exception
            //traitement
            System.out.println("Fichier inexistant par exemple");
        }catch (ClassNotFoundException e){
            //
        }

        


    }
    
}
