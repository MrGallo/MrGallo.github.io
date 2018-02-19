---
layout: page
title: Programming By Doing
permalink: /
---
<table class="problems">
{% assign sections = site.problems | map: 'section' | uniq %}
{% for section in sections %}
  {% assign section_problems = site.problems | where: 'section', section %}
  <tr><th colspan="3">{{ section }} - {{ section_problems.size }} Assignments</th></tr>
  {% for problem in section_problems %}
    <tr>
      <td>{{ problem.id | remove: '/problems/' | plus: 0 }}</td>
      <td>{% if problem.subsection %}{{ problem.subsection }}{% else %}{{ problem.section }}{% endif %}</td>
      <td><a href="{{ problem.permalink }}">{{ problem.title }}</a></td>
    </tr>
  {% endfor %}
{% endfor %}
</table>
