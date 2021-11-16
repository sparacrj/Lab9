import java.util.ArrayList;
import java.io.*;

class Main {
    static ArrayList<Person> people;
    static FileReader newFile;
    
    public static void main(String[] args) {

      people = new ArrayList<Person>();
      String name = " ", age = " ", favColor = " ";

    people.add(new Person("Reese", 22, "Red"));
    people.add(new Person("A", 87, "pink"));
    people.add(new Person("B", 13, "yellow"));
    people.add(new Person("C", 55, "black"));
    people.add(new Person("D", 4, "green"));

    FileWriter file;
    try {
      file = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(file);

      for(int i=0; i<people.size(); i++) {

      output.write(people.get(i).getName());
      output.newLine();
      output.write(Integer.toString(people.get(i).getAge()));
      output.newLine();
      output.write(people.get(i).getfavColor());
      output.newLine();
      output.flush();
      }

      output.close();
    }

    catch (IOException except)
    {
      except.printStackTrace();
    }

    try{
      newFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(newFile);
      while (reader.ready()) {
        name = reader.readLine();
        age = reader.readLine();
        favColor = reader.readLine();
        System.out.printf("%-10s %-10s %-10s %n", name, age, favColor);
      }
      reader.close();
    }

    catch (IOException except){
      except.printStackTrace();
      }
    }

  }