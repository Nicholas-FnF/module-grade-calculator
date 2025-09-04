<div align="center">
  <img width="536" height="536" alt="d3f14248-867f-4b5b-a925-75a2cd8b6e3c" src="https://github.com/user-attachments/assets/e488541c-ab13-4134-bd10-4b913bc44b36" />
</div>

A small Java program designed to help you work out your current grade in a module. You just enter your marks for assignments, exams, or other assessments, and it will calculate your overall grade so you can see how you’re doing.

## Prerequisites 📋

- Should know how to open and use a [terminal](https://en.wikipedia.org/wiki/Computer_terminal).
- Basic understanding of [Git](https://git-scm.com/) & [JSON](https://www.json.org/json-en.html).

## Installation 🛠️

1. Click the green "Code" button and copy the url.

<img width="419" height="586" alt="image" src="https://github.com/user-attachments/assets/5baa1497-dcef-4fa2-87ba-0c706089890a" />

2. Clone the project in your desired location.

```
git clone https://github.com/alsonick/module-grade-calculator.git
```

3. Open the project in your preferred IDE or code editor.

## Data 💾

You don't need to modify the source code, all you need to do is input your data into `data.json`

Here's how the JSON structure should look like:

```json
{
  "modules": [
    {
      "name": "",
      "stage": 0,
      "coursework": [
        {
          "component": "",
          "title": "",
          "type": "",
          "mark": 0
        }
      ]
    }
  ]
}
```

> All the fields should be self explanatory but there might be some confusion with the `component`field, the component field is basically _weight_ amount of the assignment or exam. The `stage` field basically just means the current year.

If you'd like to only test it with some dummy data (my actual grades) then copy this into the `data.json` file.

```json
{
  "modules": [
    {
      "name": "Databases and the Web",
      "stage": 1,
      "coursework": [
        {
          "title": "A1 - HTML & Javascript",
          "type": "Coursework",
          "component": 25,
          "mark": 89
        },
        {
          "title": "A2 - Databases & PHP",
          "type": "Coursework",
          "component": 25,
          "mark": 95
        },
        {
          "title": "Exam",
          "type": "Coursework",
          "component": 50,
          "mark": 70
        }
      ]
    }
  ]
}
```

## Running ▶️

Run the `ModuleGradeCalculator` class and you should see the result printed in the terminal.

Here's an example response:

```
--------------------

Databases and the Web | Stage: 1 | Grade Summary:

Coursework: A1 - HTML & Javascript, Mark = 89, Component = 25%
Coursework: A2 - Databases & PHP, Mark = 95, Component = 25%
Coursework: Exam, Mark = 70, Component = 50%

Final Grade: 81.00

--------------------
```

## License 📜

MIT License

Copyright (c) 2025 Nicholas Njoki

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
