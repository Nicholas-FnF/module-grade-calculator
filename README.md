<img width="636" height="1024" alt="d3f14248-867f-4b5b-a925-75a2cd8b6e3c" src="https://github.com/user-attachments/assets/e488541c-ab13-4134-bd10-4b913bc44b36" />



A small Java program that calculates your current grade for a given module.

## Installation

1. Click the green "Code" button and copy the url.

<img width="419" height="586" alt="image" src="https://github.com/user-attachments/assets/5baa1497-dcef-4fa2-87ba-0c706089890a" />

2. Clone the project in your desired location.

```
git clone https://github.com/alsonick/module-grade-calculator.git
```

3. Open the project in your preferred IDE or code editor.

## Data

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
          "title": "",
          "type": "",
          "component": "",
          "mark": 0
        }
      ]
    }
  ]
}
```

## Running

Run the `ModuleGradeCalculator` class and you should see the result printed in the 
