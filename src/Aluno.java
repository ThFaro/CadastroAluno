import javax.swing.JOptionPane;

public class Aluno {
    
    private String ra;
    private String curso;
    private String nome;

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String imprimir(){
        return "Olá " + nome + "." + " Seu RA é: " + ra + "." + " Você está matriculado no curos de " + curso + ".";
}
    public void menu(){
        String selectedOption;

        do{

        Object [] itens = {"Criar aluno","Mostrar aluno", "Sair"};
        selectedOption = (String) JOptionPane.showInputDialog(
        null,"Escolha", "Menu", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        if(selectedOption!=null){

            switch(selectedOption){

                case "Criar aluno":
                String gerarNome = JOptionPane.showInputDialog("Digite seu nome: ");
                setNome(gerarNome);
                String gerarRa =  JOptionPane.showInputDialog("Digite seu RA: ");
                setRa(gerarRa);
                String gerarCurso =  JOptionPane.showInputDialog("Digite seu curso: ");
                setCurso(gerarCurso);
                break;

                case "Mostrar aluno":
                JOptionPane.showMessageDialog(null,imprimir());
                break;

            }
        }

        }while(!"Sair".equals(selectedOption));
    }

    
}

