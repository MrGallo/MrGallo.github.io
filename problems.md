---
layout: page
title: Problems
permalink: /problems/
topic: none
---
<h1 class="post-title">{{ page.title }}</h1>
<ol>
{% for problem in site.problems %}
  <li><a href="{{ problem.permalink }}">{{ problem.topic }}: {{ problem.title }}</a></li>
{% endfor %}
</ol>
