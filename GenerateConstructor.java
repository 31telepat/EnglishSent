package com.company;

public class GenerateConstructor {
    void generateConstructor () {
        int i = (int) (Math.random()*9);
        switch (i) {
            case 0: // вопрос в будущем
                System.out.println("Will " + new GenerateWords().pronounGenerate()
                        + " " + new GenerateWords().verbGenerate() + "?");
                break;
            case 1: // утверждение в будущем
                System.out.println(new GenerateWords().pronounGenerate() + " will " + new GenerateWords().verbGenerate());
                break;
            case 2: // отрицание в будущем
                System.out.println(new GenerateWords().pronounGenerate() + " will not " + new GenerateWords().verbGenerate());
                break;
            case 3: // вопрос в настоящем
                String tempPronoun = new GenerateWords().pronounGenerate();
                if (tempPronoun.equals("it") || tempPronoun.equals("he") || tempPronoun.equals("she")) {
                    System.out.println("Does " + tempPronoun + " " + new GenerateWords().verbGenerate() + "?");
                }
                else {
                    System.out.println("Do " + tempPronoun + " " + new GenerateWords().verbGenerate() + "?");
                }
                break;
            case 4: // утверждение в настоящем
                String tempPronounCase4 = new GenerateWords().pronounGenerate();
                if (tempPronounCase4.equals("it") || tempPronounCase4.equals("he") || tempPronounCase4.equals("she")) {
                    System.out.println(tempPronounCase4 + " " + new GenerateWords().verbGenerate() + "s");
                }
                else {
                    System.out.println(tempPronounCase4 + " " + new GenerateWords().verbGenerate());
                }
                break;
            case 5: // отрицание в настоящем
                String tempPronounCase5 = new GenerateWords().pronounGenerate();
                if (tempPronounCase5.equals("it") || tempPronounCase5.equals("he") || tempPronounCase5.equals("she")) {
                    System.out.println(tempPronounCase5 + " doesn't  " + new GenerateWords().verbGenerate());
                }
                else {
                    System.out.println(tempPronounCase5 + " don't " + new GenerateWords().verbGenerate());
                }
                break;
            case 6: // вопрос в прошлом
                System.out.println("Did " + new GenerateWords().pronounGenerate() + " " + new GenerateWords().verbGenerate()+"?");
                break;
            case 7: // утверждение в прошлом
                System.out.println(new GenerateWords().pronounGenerate() + " " + new GenerateWords().verbGenerate()+"d");
                break;
            case 8: // отрицание в прошлом
                System.out.println(new GenerateWords().pronounGenerate() + " didn't " + new GenerateWords().verbGenerate());
                break;
            default:
                System.out.println("Какой-то косяк в генераторе конструкторов");
        }
    }
}
