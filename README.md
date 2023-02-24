Poniżej przekazujemy zadanie z prośbą o analizę poniższego kodu i zaimplementowanie metod findBlockByColor, findBlocksByMaterial, count w klasie Wall - najchętniej unikając powielania kodu i umieszczając całą logikę w klasie Wall. Z uwzględnieniem w analizie i implementacji interfejsu CompositeBlock!

interface Structure {
// zwraca dowolny element o podanym kolorze
Optional<Block> findBlockByColor(String color);

// zwraca wszystkie elementy z danego materiału
List<Block> findBlocksByMaterial(String material);

//zwraca liczbę wszystkich elementów tworzących strukturę
int count();
}

public class Wall implements Structure {
private List<Block> blocks;
}

interface Block {
String getColor();
String getMaterial();
}

interface CompositeBlock extends Block {
List<Block> getBlocks();
}

Prosimy o wykonanie zadania bez korzystania z pomocy. Zadanie należy umieścić na jednej z dostępnych platform (np. github, gitlab, bitbucket, etc.)