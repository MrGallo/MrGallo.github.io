---
layout: page
title: Code Challenges
permalink: /code-challenges/
---

The following can be completed at *any* time during the 
semester when you feel you are ready. Each challenge will be done with **pencil and paper**
with our approved cheatsheet unnless otherwise stated in the particular challenge's description.

You may also re-take any challenge with a `10%, 20%, 30% .. etc.` pentalty each 
successive time.  Please see below what will be required for 
each challenge.

### Requirements
{% include challenge-grade-req.md grade="10" %}
{% include challenge-grade-req.md grade="11" %}
{% include challenge-grade-req.md grade="12" %}


**You may be exempt from doing these.** If you are working on one of our inter-class 
projects, you may submit a [GitHub pull request](https://help.github.com/articles/about-pull-requests/) 
link to some code you believe accomplishes the general objective described in a particular code challenge.

---

{% for section in site.challenge_sections %}

### {{ section.name }}

    {% for challenge in section.challenges %}
1. {{ challenge }}
    {% endfor %}

{% endfor %}
