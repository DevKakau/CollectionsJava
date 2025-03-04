public class Main {

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Kauã", 323423423);
        agenda.adicionarContato("Kauã", 534);
        agenda.adicionarContato("Kauã lopes", 34352223);
        agenda.adicionarContato("Kauã lopes silva", 424523);
        agenda.adicionarContato("Ana", 987654321);
        agenda.adicionarContato("Ana", 987654321);
        agenda.adicionarContato("Bruno", 119876543);
        agenda.adicionarContato("Carla", 219876123);
        agenda.adicionarContato("Daniel", 319123456);
        agenda.adicionarContato("Eduarda", 419654987);
        agenda.adicionarContato("Fernando", 519741852);
        agenda.adicionarContato("Gabriela", 629852741);


        System.out.println(agenda.pesquisarPorNome("Kauã"));
        agenda.atualizarContato("Kauã", 1312111);
        agenda.exibirContatos();

    }
}