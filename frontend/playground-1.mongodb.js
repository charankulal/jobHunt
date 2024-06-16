/* global use, db */
// MongoDB Playground
// To disable this template go to Settings | MongoDB | Use Default Template For Playground.
// Make sure you are connected to enable completions and to be able to run a playground.
// Use Ctrl+Space inside a snippet or a string literal to trigger completions.
// The result of the last command run in a playground is shown on the results panel.
// By default the first 20 documents will be returned with a cursor.
// Use 'console.log()' to print to the debug output.
// For more documentation on playgrounds please refer to
// https://www.mongodb.com/docs/mongodb-vscode/playgrounds/

// Select the database to use.
use('jobhunt');


db.getCollection('jobpost').insertMany([
 
     
          {
            "id": 1,
            "profile": "Frontend Developer",
            "exp": 1,
            "desc": "Front-end web development is the development of the graphical user interface of a website, through the use of HTML, CSS, and JavaScript",
            "techs": [
              "Javascript",
              "React"
            ]
          },
          {
            "profile": "Data Scientist",
            "experience": "1",
            "skill": [
              "Python"
            ],
            "description": "\nTo work as a data scientist, you must have an undergraduate or a postgraduate degree in a relevant discipline, such as Business information systems, Computer science, Economics, Information Management, Mathematics and Statistics.",
            "id": 2
          },
          {
            "profile": "Blockchain Developer",
            "experience": "1",
            "skill": [
              "Rust",
              "Javascript"
            ],
            "description": "\nBlockchain software developers build applications onto existing blockchain platforms. They handle front-end and back-end development, design, and maintenance.",
            "id": 3
          }
        
      
]);

