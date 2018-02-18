---
layout: page
title: Programming By Doing
permalink: /
topic: none
---
[Install Java](/problems/jdk-install/)
<ol start="0">
{% for problem in site.problems %}
  <li><a href="{{ problem.permalink }}">{{ problem.topic }}: {{ problem.title }}</a></li>
{% endfor %}
</ol>
