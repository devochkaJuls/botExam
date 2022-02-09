public class DemoExam {
    String[] banks;
    int salary;
    String[] gender;
    String[] married;
    String[] children;
    int age;
    String[] products;
    String[] profs;


    public String getBanks() {
        banks = new String[29];
        banks[0] = "Сбербанк";
        banks[1] = "ВТБ";
        banks[2] = "РоссельхозБанк";
        banks[3] = "Банк Траст";
        banks[4] = "Локо Банк";
        banks[5] = "Альфа";
        banks[6] = "ЮниКредит";
        banks[7] = "СовкомБанк";
        banks[8] = "Почта Банк";
        banks[9] = "РусфинансБанк";
        banks[10] = "Кредит Европа Банк";
        banks[11] = "Тинькофф";
        banks[12] = "ОТП Банк";
        banks[13] = "Райффазен Банк";
        banks[14] = "АК Барс Банк";
        banks[15] = "Убрир";
        banks[16] = "ПСБ Банк";
        banks[17] = "Интеза";
        banks[18] = "СКБ Банк";
        banks[19] = "СМП Банк";
        banks[20] = "ГазпромБанк";
        banks[21] = "МКБ Банк";
        banks[22] = "УралСиб";
        banks[23] = "Открытие";
        banks[24] = "Хоум Кредит Банк";
        int x = (int) Math.round(Math.random() * 24);
        return "Банк: " + banks[x];
    }

    public String getSalary() {
        salary = (int) Math.round((Math.random() * 140000) + 18000);
        return "Зарплата: " + salary;
    }

    public String getMarried() {
        married = new String[8];
        married[0] = "в браке";
        married[1] = "не в браке";
        int x = (int) Math.round(Math.random() * 1);
        return "Семейное положение: " + married[x];
    }

    public String  getChildren() {
        children = new String[11];
        children[0] = "ребенок 5 лет";
        children[1] = "ребенок 15 лет";
        children[2] = "ребенок 19 лет";
        children[3] = "ребенок 1 год";
        children[4] = "дети 11 лет и 15 лет";
        children[5] = "дети 5 лет и 15 лет";
        children[6] = "дети 1 год, 4 года и 15 лет";
        children[7] = "нет";
        children[8] = "нет";
        children[9] = "нет";
        children[10] = "нет";

        int x = (int) Math.round(Math.random() * 11);
        return "Дети: " + children[x];
    }

    public String getGender() {
        gender = new String[2];
        gender[0] = "Женщина";
        gender[1] = "Мужчина";
        int x = (int) Math.round(Math.random() * 1);
        return "Пол: " + gender[x];
    }

    public String getAge() {
        age = (int) Math.round((Math.random() * 75) + 18);
        return "Возраст: " + age;
    }

    public String getBankProduct() {
        products = new String[13];
        products[0] = "Кредит";
        products[1] = "Автокредит(трейд ин)";
        products[2] = "Автокредит(из салона)";
        products[3] = "Автокредит(с рук)";
        products[4] = "Ипотека(новостройка)";
        products[5] = "Ипотека(вторичка)";
        products[6] = "Кредит наличкой";
        products[7] = "Потребительский кредит(ремонт)";
        products[8] = "Потребительский кредит(одежда)";
        products[9] = "Потребительский кредит(путешествия)";
        products[10] = "Кредитная карта";
        products[11] = "Дебетовая карта";
        products[12] = "Рефинансирование";
        int x = (int) Math.round(Math.random() * 13);
        return "Банковский продукт: " + products[x];
    }

    public String getProfession() {
        profs = new String[18];
        profs[0] = "Юрист";
        profs[1] = "Экономист";
        profs[2] = "Секретарь";
        profs[3] = "Психолог";
        profs[4] = "Программист";
        profs[5] = "Повар";
        profs[6] = "Парикмахер";
        profs[7] = "Официант";
        profs[8] = "Менеджер";
        profs[9] = "Кассир";
        profs[10] = "Пилот";
        profs[11] = "Бортпроводник";
        profs[12] = "Журналист";
        profs[13] = "Дизайнер";
        profs[14] = "Врач";
        profs[15] = "Бухгалтер";
        profs[16] = "Архитектор";
        profs[17] = "Водитель";

        int x = (int) Math.round(Math.random() * 17);
        return "Профессия: " + profs[x];
    }
}
