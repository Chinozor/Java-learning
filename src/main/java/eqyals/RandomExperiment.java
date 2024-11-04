package eqyals;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomExperiment {
    // Ваш генератор случайных чисел
    static class CustomRandom {
        static int random;
        static int sleep;
        static int random1;
        static int random2;
        static int randomNumber;

        public static int generateRandomNumber() {
            // Генерация random
            for (int i = 0; i < (System.currentTimeMillis() % 10) + 1; i++) {
                random = (int) (System.currentTimeMillis() % 100);
                sleep = (int) (((System.currentTimeMillis() % 10)) * ((System.currentTimeMillis() % 10)) / ((System.currentTimeMillis() % 10) + 1));
                try {
                    Thread.sleep(sleep + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            // Генерация random1
            for (int i = 0; i < (System.currentTimeMillis() % 10) + 1; i++) {
                random1 = (int) (System.currentTimeMillis() % 100 + 1);
                sleep = (int) (((System.currentTimeMillis() % 10)) * ((System.currentTimeMillis() % 10)) / ((System.currentTimeMillis() % 10) + 1));
                try {
                    Thread.sleep(sleep + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (random1 < 10) {
                    random1 = (int) (System.currentTimeMillis() % 1000);
                }
            }
            // Генерация random2
            for (int i = 0; i < (System.currentTimeMillis() % 10) + 1; i++) {
                random2 = (int) (System.currentTimeMillis() % 100 + 1);
                sleep = (int) (((System.currentTimeMillis() % 10)) * ((System.currentTimeMillis() % 10)) / ((System.currentTimeMillis() % 10) + 1));
                try {
                    Thread.sleep(sleep + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (random2 < 10) {
                    random2 = (int) (System.currentTimeMillis() % 1000);
                }
            }
            randomNumber = (random1 * random + random2) % 100;
            return randomNumber;
        }
    }

    public static void main(String[] args) {
        int experiments = 10000; // Количество экспериментов

        // Хэш-карта для хранения результатов вашего генератора
        Map<Integer, Integer> customResults = new HashMap<>();

        // Эксперименты с вашим генератором
        for (int i = 0; i < experiments; i++) {
            int number = CustomRandom.generateRandomNumber(); // Генерирует число от 0 до 99
            customResults.put(number, customResults.getOrDefault(number, 0) + 1);
        }

        // Вывод результатов вашего генератора
        System.out.println("Results from Custom Random Generator:");
        customResults.forEach((key, value) -> System.out.println("Number: " + key + ", Count: " + value));

        // Хэш-карта для хранения результатов стандартного генератора
        Map<Integer, Integer> standardResults = new HashMap<>();
        Random random = new Random();

        // Эксперименты со стандартным генератором
        for (int i = 0; i < experiments; i++) {
            int number = random.nextInt(100); // Генерирует число от 0 до 99
            standardResults.put(number, standardResults.getOrDefault(number, 0) + 1);
        }

        // Вывод результатов стандартного генератора
        System.out.println("\nResults from Java Random:");
        standardResults.forEach((key, value) -> System.out.println("Number: " + key + ", Count: " + value));
    }
}
