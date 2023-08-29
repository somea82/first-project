public class test {

    public static void main(String[] args){

        ProcessGpt processGpt = new ProcessGpt();

        try {
            String test = processGpt.PublisherGPT("최근의 학무보의 괴롭힘 때문에 안타까운 선택하신 교사분이 있었죠 정말 많은 분들이 마음 아파하시면서 조건 문제가 다시 주목을 받고 있어요. 관련해 가지고 청원이 많이 올라왔습니다 그 청와대에서 하던 국민청원은 지금 없어졌고 대신에 국회에서 하는 국민등원 청원이 있거든요 바로 여기에 교권을 보호해 달라는 청원들이 올라온 겁니다 근데 이게 국회에서 다뤄지기 전에 절차를 조금 거쳐야 되는데 일단 한 달 안에 5만명이 동의를 해야 돼요 근데 청원들이 이틀만에 5만명을 채운거죠 그만큼 요새 가장 관심이 쓸리는 사건이고 많은 분들이 분노하는 사건입니다.");
            System.out.println(test);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}