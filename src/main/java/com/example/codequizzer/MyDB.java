package com.example.codequizzer;

import java.util.HashMap;

public class MyDB {

    public HashMap<Integer, String> programmDB = new HashMap<>();

    public MyDB() {

    int counter = 0;
        programmDB.put(++counter, "Чи є різниця ++i i++ ? ");
        programmDB.put(++counter, "Що таке ООП?");
        programmDB.put(++counter, "Які є принципи ООП?");
        programmDB.put(++counter, "Що таке абстракція?");
        programmDB.put(++counter, "Що таке інкапсуляція?");
        programmDB.put(++counter, "Що таке наслідування?");
        programmDB.put(++counter, "Що таке поліморфізм?");
        programmDB.put(++counter, "Що таке відношення в джава?");
        programmDB.put(++counter, "Що таке асоціація?");
        programmDB.put(++counter, "Що таке агрегація?");
        programmDB.put(++counter, "Що таке композиція?");
        programmDB.put(++counter, "Що таке клас?");
        programmDB.put(++counter, "Що таке об'єкт?");
        programmDB.put(++counter, "Які є методи об'єкта?");
        programmDB.put(++counter, "Що таке інтерфейс?");
        programmDB.put(++counter, "Що таке абстрактний клас?");
        programmDB.put(++counter, "В чому різниця між інтерфейсом " + "\n " + " та абстрактним класом?");
        programmDB.put(++counter, "Коли використовувати інтерфейс " + "\n " + "а коли абстрактний клас?");
        programmDB.put(++counter, "Що таке примітиви?");
        programmDB.put(++counter, "Які є види пам'ті в джава?");
        programmDB.put(++counter, "Що таке stack?");
        programmDB.put(++counter, "Що таке heap?");
        programmDB.put(++counter, "Що таке перегрузка?");
        programmDB.put(++counter, "Що таке переопреділення?");
        programmDB.put(++counter, "Що таке конструктор?");
        programmDB.put(++counter, "Що таке finalize?");
        programmDB.put(++counter, "Що таке final?");
        programmDB.put(++counter, "Що таке finally?");
        programmDB.put(++counter, "В чому різниця між finalize, final, finally?");
        programmDB.put(++counter, "Що таке enum?");
        programmDB.put(++counter, "Що таке серіалізація?");
        programmDB.put(++counter, "Що таке jpa та orm? В чому різниця?");
        programmDB.put(++counter, "Що таке hibernate?");
        programmDB.put(++counter, "Що таке cloneable?");
        programmDB.put(++counter, "Що таке comparable?");
        programmDB.put(++counter, "Що таке comparator?");
        programmDB.put(++counter, "Що таке to String?");
        programmDB.put(++counter, "Що таке equals?");
        programmDB.put(++counter, "В чому різниця між == та equals?");
        programmDB.put(++counter, "Що таке hashcode?");
        programmDB.put(++counter, "Що таке getclass?");
        programmDB.put(++counter, "Що таке wait?");
        programmDB.put(++counter, "Що таке notify?");
        programmDB.put(++counter, "Що таке notify all?");
        programmDB.put(++counter, "Що таке колекції?");
        programmDB.put(++counter, "Різниця між колекцією та масивом?");
        programmDB.put(++counter, "Що таке Set?");
        programmDB.put(++counter, "Що таке List?");
        programmDB.put(++counter, "Що таке Map?");
        programmDB.put(++counter, "Що таке Queue?");
        programmDB.put(++counter, "Що таке ArrayList?");
        programmDB.put(++counter, "Що таке LinkedList?");
        programmDB.put(++counter, "Що таке vector?");
        programmDB.put(++counter, "Що таке HashMap?");
        programmDB.put(++counter, "Що таке TreeMap?");
        programmDB.put(++counter, "Що таке LinkedHashMap?");
        programmDB.put(++counter, "Що таке HashSet?");
        programmDB.put(++counter, "Що таке TreeSet?");
        programmDB.put(++counter, "Що таке LinkedHashSet?");
        programmDB.put(++counter, "Що таке PriorityQueue?");
        programmDB.put(++counter, "Різниця між Queue i PriorityQueue?");
        programmDB.put(++counter, "Що таке ArrayDeque?");
        programmDB.put(++counter, "Що таке Iterator?");
        programmDB.put(++counter, "Що таке ListIterator?");
        programmDB.put(++counter, "Як працює HashMap?");
        programmDB.put(++counter, "Що таке Equals та Hashcode?");
        programmDB.put(++counter, "Що таке CollectionApi?");
        programmDB.put(++counter, "Що таке big O Notation?");
        programmDB.put(++counter, "Що таке 0(1)?");
        programmDB.put(++counter, "Що таке Red-Black Tree?");
        programmDB.put(++counter, "Що таке Exception?");
        programmDB.put(++counter, "Які є види Exception?");
        programmDB.put(++counter, "Що таке Checked Exception?");
        programmDB.put(++counter, "Що таке Unchecked Exception?");
        programmDB.put(++counter, "Що таке Throw?");
        programmDB.put(++counter, "Що таке Throws?");
        programmDB.put(++counter, "Що таке Multithreading?");
        programmDB.put(++counter, "Які є стани потоку?");
        programmDB.put(++counter, "Що таке синхронне програмування?");
        programmDB.put(++counter, "Що таке асинхронне програмування?");
        programmDB.put(++counter, "Що таке Volatile?");
    }


    public String returnMyDB () {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i: programmDB.keySet()) {
            stringBuilder.append(i).append(". ").append(programmDB.get(i)).append("\n");
        }
        return stringBuilder.toString();
    }
    public String returnID (int i) {
        return programmDB.get(i);
    }
}
