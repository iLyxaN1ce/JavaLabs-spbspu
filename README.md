# Лабораторные работы по дисциплине "ООП. Java"
## 1-й семестр 2-го курса СПбПУ ИКНТ ПИ (2021-2022 уч. г.)
---
### Лабораторная №1.
   В компьютерной игре герой (класс Hero) может перемещаться между 
двумя  точками  (метод  move)  различными  способами:  идти  пешком, 
ехать  на  лошади,  лететь  и  т. п.  Реализовать  классы,  позволяющие 
выбирать и менять в ходе выполнения программы способ перемещения 
героя,  используя  паттерн  “стратегия”  (strategy).  Продемонстрировать 
работу реализованных классов.
___
### Лабораторная №2.
#### Написать консольное приложение, которое: 
1.  Считывает из текстового файл размерность матрицы N*N. 
1.  Создаёт и заполняет матрицу случайными числами от -N до N. 
1.  Последовательно поворачивает матрицу на 90, 180 и 270 градусов 
против  часовой  стрелки  и  делит  каждый  элемент  на  сумму 
соседних. 
1.  Каждую из трёх получившихся матриц вывести в общий файл.

#### Требования к обработке исключительных ситуаций: 
1.  Контролировать  состояние  потоков  ввода/вывода  (отсутствие 
записи в файле, недопустимые значения, etc).
1.  Генерировать  и  обрабатывать  исключение  при  некорректных 
математических операциях.
1.  Выбрасывать исключение при нехватке памяти.
1.  Реализовать собственные классы исключений для случаев:
     * деление на 0;
     * файл не существует;
     * N > 1_000_000.
---
### Лабораторная №3.
#### Создайте иерархию животного царства на свое усмотрение:
выбираем один  тип  (простейшие/губки/хордовые  и т.д.),  а  далее  наследуйте 
классы, отряды, семейства, роды и виды) - должна получиться иерархия 
в 6 уровней, выбор животных на ваш вкус, особо много создавать не 
нужно. 
#### Затем, для получившейся иерархии, выполняем следующее: 
1. Создаем  обобщенный класс  Queue,  представляющий  из  себя 
очередь  фиксированного  размера  со  стандартными  методами 
очереди - add и get.
1. Создаем  методы  produce  и  consume:  
     * Produce должен возвращать upper bound generic очередь (например, наследники 
позвоночных) из n животных, которая будет генерироваться на 
ваше усмотрение и подаваться во второй метод. 
      * Consume будет их распределять  в  2  или  более lower bound очереди - например, 
родители кошек и родители змей, выбор типов также остаётся за 
вами.
3. Демонстрируем работу всех методов на конкретных собственных 
кейсах.
---
### Лабораторная №4.
#### Написать аннотацию с целочисленным параметром.
1. Создать класс, содержащий только приватные методы (3–4 шт.).
1. Аннотировать любые из них.
1. Вызвать из другого класса все аннотированные методы столько
раз, сколько указано в параметре аннотации.
---
### Дополнительное задание.
#### Разработайте набор классов для текстовой разметки:   
   1. Класс Paragraph может содержать произвольное число других элементов разметки и текстовых элементов.
   1. Класс Text – текстовый элемент.
   1. Классы разметки Emphasis, Strong, Strikeout – выделение, сильное выделение и зачеркивание. 
>Элементы разметки могут содержать произвольное число других элементов разметки и текстовых элементов.
#### Все классы должны реализовывать метод toMarkdown(StringBuilder), который должен генерировать Markdown-разметку по следующим правилам:
   * текстовые элементы выводятся как есть;
   * выделенный текст окружается символами '*';
   * сильно выделенный текст окружается символами '__';
   * зачеркнутый текст окружается символами '~'.
#### Следующий код должен успешно компилироваться:
    Paragraph paragraph = new Paragraph(List.of(
        new Strong(List.of(
            new Text("1"),
            new Strikeout(List.of(
                new Text("2"),
                new Emphasis(List.of(
                    new Text("3"),
                    new Text("4")
                )),
                new Text("5")
            )),
            new Text("6")
        ))
    ));
>Вызов paragraph.toMarkdown(new StringBuilder()) должен заполнять переданный StringBuilder следующим содержимым:

    __1~2*34*5~6__
