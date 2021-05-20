# AND-Project
[Last Commit]
Due to bad time management, i was only able to implement a little part of the offline part : The user can only add books in a database, 
and see them in a recycler view. 
Here is the link to the presentation : https://youtu.be/W77lFf-da-s
On the online side, the user can just login , but norhing is implemented.
\br
Share your books 
This app is made for book lovers which wants to manage their bookshelves, lend their books and see them back.
A normal use case would be to register your own books into a local database which would be filled thanks to a call to the Google Book API.
The Google Book API call would be using the ISBN or other fields to find the rights data.
Then the user could choose which book from its shelf he wants to share to other (with friend or with everyone).

Must have

| What | Why |
| --- | --- |
| Login system | A user can save its data online |
| Fetch book data from the Google Book  API | Fill local storage |
| Fire base connection | - Other user could look in your book shelf<br/>- User can synchronize the data base with other device<br/> |
| A book shelf page | User can see all its books |
| A lended  book page | User can see with whom are its books |
| A borrowed book page | User can see to whom he owes book |
| Search a book | User can search a book and ask for borrowing it |

Should have

| What | Why |
| --- | --- |
| Possibility to comment the book/rate it | Share the user's opinion about the book |
| Grade the state of the book (is a stain, torned) | Have a guarantee on the book condition |
| Notification of due date | User can rember when to bring back the book |
| Add manually a book | In case it's not in google book |

Could have

| What | Why |
| --- | --- |
| Grading system for lend | See if an uknown user can be trusted when borrowing the book |
| Info page about author | Get other info about the author throug an other api maybye |
| Barcode reader | Get directly the ISBN from the book. |

Wont have

| What | Why |
| --- | --- |
| Chat | It should'nt be a social network as Goodreads. |
|     |     |
|     |     |
