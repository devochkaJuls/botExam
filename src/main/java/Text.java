public class Text {
    private StringBuilder text;

    public Text() {
        text = new StringBuilder();
        DemoExam demo = new DemoExam();
        text.append(demo.getBanks() + "\n");
        text.append(demo.getSalary() + "\n");
        text.append(demo.getMarried() + "\n");
        text.append(demo.getChildren() + "\n");
        text.append(demo.getGender() + "\n");
        text.append(demo.getAge() + "\n");
        text.append(demo.getBankProduct() +"\n");
        text.append(demo.getProfession() + "\n");
    }

    public String getText() {
        return text.toString();
    }
}
