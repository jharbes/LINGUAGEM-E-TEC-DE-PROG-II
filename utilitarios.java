utilitarios java

String.format("%.2f",variavel)  - colocar com duas casas decimais***

Locale.setDefault(Locale.US);

Scanner teclado=new Scanner(System.in);


teclado.nextLine();  -  nao pular a necessidade de entrada.


-------------------------------
For each em JAVA:

String[] vetor=new String[10];

for (String x:vetor){
	System.out.println(x);
}
-------------------------------

---------------------------------------------------------------
LISTAS EM JAVA

• Tamanho da lista: size()

• Obter o elemento de uma posição: get(position)

• Inserir elemento na lista: add(obj), add(int, obj)

• Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
	
• Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)

• Filtrar lista com base em predicado:
List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());

• Encontrar primeira ocorrência com base em predicado:
Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);

----------------------------------------------------------------



----------------------------------------------------------------

MVC - Model View Controller


MODEL
	-ENTITIES
	-ENUMS
	-EXCEPTION
	-SERVICES

