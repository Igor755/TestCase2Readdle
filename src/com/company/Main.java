package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*

        Тест 2: MySQL
        Скачать и установить тестовую базу данных world database (http://
        downloads.mysql.com/docs/world.sql.zip) и составить следующие запросы:
        1. Топ-5 стран по количеству населения в столице
        2. Суммарное кол-во людей, говорящих на английском языке в Европе
        3. Список стран с двумя и более официальными языками, в которых количество
        неофициальных языков как минимум вдвое больше, чем официальных


       1)select Name from country where Code IN (select CountryCode from city) order by Population Desc Limit 5

       2) select sum(POPULATION*percentage) from country JOIN countrylanguage ON countrylanguage.CountryCode = country.Code where Continent = 'Europe' and Language = 'English'

       3) select Name FROM country  where code in (

                SELECT Councode from

                        (SELECT T1.CountryCode as Councode, T1.ct1, T2.ct2 from

                                        (select CountryCode, count(CountryCode) AS ct1 From countrylanguage where IsOfficial = 'F' group by CountryCode) as T1

                                left join

                                        (select CountryCode, count(CountryCode) AS ct2 From countrylanguage where IsOfficial = 'T' group by CountryCode HAVING count(*)>1) as T2

                on (T1.CountryCode = T2.CountryCode)

                HAVING (T1.ct1 / T2.ct2) > 2) as magik_operation)

*/

    }
}
