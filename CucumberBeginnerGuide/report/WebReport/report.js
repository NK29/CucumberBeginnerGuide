$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:featureFiles/BackgroundHook.feature");
formatter.feature({
  "name": "To explain the usage of background",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BackgroundExample"
    }
  ]
});
formatter.background({
  "name": "Student completed school education",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the student finished high school",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_finished_high_school()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student finished higher secondary",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_finished_higher_secondary()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To study medicine",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BackgroundExample"
    }
  ]
});
formatter.step({
  "name": "the student applied for the medical course",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_applied_for_the_medical_course()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student cleared the entrance exam",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_cleared_the_entrance_exam()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student is eligible for joining any medical institude",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_is_eligible_for_joining_any_medical_institude()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Student completed school education",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the student finished high school",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_finished_high_school()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student finished higher secondary",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_finished_higher_secondary()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To study Engineering",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BackgroundExample"
    }
  ]
});
formatter.step({
  "name": "the student applied for the Engineering course",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_applied_for_the_Engineering_course()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student has a sayable cut off",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_has_a_sayable_cut_off()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student is eligible for joining any Engineering institude",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundExample_Step_Def.the_student_is_eligible_for_joining_any_Engineering_institude()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});