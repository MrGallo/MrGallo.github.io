---
layout: page
title: Programming By Doing
permalink: /
topic: none
---
[Install Java](/problems/jdk-install/)
<ol>
{% for problem in site.problems %}
  <li><a href="{{ problem.permalink }}">{{ problem.topic }}: {{ problem.title }}</a></li>
{% endfor %}
</ol>
