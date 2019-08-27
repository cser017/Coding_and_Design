/*
Movie Titles

To solve this challenge, you are required to write an HTTP GET method to retrieve information from a movie database.
 Function Description
Given a string substr, getMovieTitles must perform the following tasks:
1. Query
2. Initialize the titles array to store   string elements. Store the   from each record returned in the data field to the titles array. 3. Sort titles in ascending order and return it as your answer.
The query response from the website is a JSON response with the following five fields:

page: The current page.
per_page: The maximum number of results per page.
total: The total number of records in the search result.
total_pages: The total number of pages which must be queried to get all the results.
data: An array of JSON objects containing movie information
In order to get all results, you may have to make multiple page requests. To request a page by number, your query should read
  https://jsonmock.hackerrank.com/api/movies/search/?Title=substr
(replace substr).

Sample Input 0
spiderman
Sample Output 0
pageNumber
, replacing substr and
  
Amazing Spiderman Syndrome
Fighting, Flying and Driving: The Stunts of Spiderman 3
Hollywood's Master Storytellers: Spiderman Live
Italian Spiderman
Spiderman
Spiderman
Spiderman 5
Spiderman and Grandma
Spiderman in Cannes
Superman, Spiderman or Batman
The Amazing Spiderman T4 Premiere Special
The Death of Spiderman
They Call Me Spiderman

*/

public class Solution {
    /*
     * Complete the function below.
     * Base url: https://jsonmock.hackerrank.com/api/movies/search/?Title=
     */
    static String[] getMovieTitles(String substr) {

    }
}