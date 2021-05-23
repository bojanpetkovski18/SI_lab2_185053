## Втора лабораториска вежба по Софтверско инженерство

# Бојан Петковски, бр. на индекс 185053

# Control Flow Graph
![CFG](https://user-images.githubusercontent.com/74257097/119269002-c287e680-bbf5-11eb-8e2d-8e8096fd877f.png)

# Цикломатска комплексност

Цикломатската комплексност на кодот е 8 и резултатот го добив со равенката R = E - V + 2 каде што E се ребрата а V се јазлите. Во случајов бројот на јазлите е 21, а бројот на ребрата е 27, т.ш R = 27 - 21 + 2 = 8.

# Тест случаи според критериумот Every statement
![C0](https://user-images.githubusercontent.com/74257097/119269034-e9deb380-bbf5-11eb-970a-019fa2035e0d.png)

# Тест случаи според критериумот Every path
![MC](https://user-images.githubusercontent.com/74257097/119269041-f8c56600-bbf5-11eb-989c-1a2dc5b2975f.png)

# Објаснување на напишаните unit tests

Со Multiple condition критериумот ги истестирав сите boolean вредности добиени од сите conditions во кодот. Првин со помош на табелата за сите патишта во графот од сите посебни влезови ги најдов соодветните вредности што се добиваат од секоја IF-ELSE проверка. Доколку за одреден пат потребно е да биде еден метод точен, бележев со T, за неточен соодветно со F, но исто така за conditions кои не беа достижни во кодот бележев со х. Другата табела е за Every Condition критериумот што ги проверува посебно сите IF-ELSE Conditions и посебните проверки што се одвиваат во нив. Вредностите беа запишувани посебно за сите влезни параметри.
 
Со C1 - Еvery Branch критериумот ја добив табелата што е прикачена во .zip датотеката. Со дадените влезови за параметри на функцијата се опфатени и поминати сите гранки на CFG. Начинот на којшто го добив резултатот е да се проверат повеќе влезови така што секоја од гранките барем еднаш ќе биде поминета. Ми беа потребни 8 различни влезови за да се постигне резултатот. Додека гранките беа именувани како релации меѓу јазлите на којшто имаше проверка, доделување и throw statements. Во кодот има коментари каде што се именувани сите јазли.
