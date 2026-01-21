package com.code;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonFileManager manager = new PersonFileManager();
        /*
         * List<Person> people = manager.readAll();
         * for (Person p : people) {
         * System.out.println(p.getName());
         * }
         */

        Person person1 = new Person("Brian", 19, true, 3);
        manager.insert(person1);
        Person person2 = new Person("Alice", 30, false, 6);
        manager.insert(person2);
        Person person3 = new Person("Jose", 36, true, 2);
        manager.insert(person3);

        System.out.println("Get by id: " + manager.getById(6).getName());

        manager.update(new Person("Juan", 20, false, 3));
        System.out.println();
        System.out.println("Updated person: " + manager.getById(3).getName());

        manager.delete(6);

        System.out.println();
        List<Person> people = manager.readAll();
        for (Person p : people) {
            System.out.print(p.getName() + " ");
        }

        // Person person = new Person("Ana", 22, true);
        // Gson gson = new Gson();
        // String json = gson.toJson(person);
        // System.out.println(json);

        // Escribir en el json
        /*
         * try (FileWriter writer = new FileWriter("person.json")) {
         * gson.toJson(person, writer);
         * } catch (IOException e) {
         * System.out.println("Error al escribir el archivo");
         * }
         */

        // Para solo un objeto
        /*
         * try (FileReader reader = new FileReader("person.json")) {
         * Person person2 = gson.fromJson(reader, Person.class);
         * System.out.println(person2);
         * } catch (IOException e) {
         * System.out.println("Error al leer el archivo");
         * }
         */

        // Para una lista
        /*
         * try (FileReader reader = new FileReader("person.json")) {
         * Type type = new TypeToken<ArrayList<Person>>() {
         * }.getType();
         * List<Person> people = gson.fromJson(reader, type);
         * for (Person p : people) {
         * System.out.println(p.getName());
         * }
         * } catch (IOException e) {
         * System.out.println("Error al leer el archivo");
         * }
         */

    }
}