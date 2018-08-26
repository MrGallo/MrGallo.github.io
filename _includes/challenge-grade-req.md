#### Grade {{ include.grade }}
{% capture expression %}{{ "item['" | append: include.grade | append: "'] > 0" }}{% endcapture%}
{% assign challenge_total = 0 %}
{% assign grade_sections = site.challenge_sections | where_exp: 'item', expression %} 
<table style="text-align:left;">
<tr>
    <th>Section</th>
    <th>Must complete</th>
</tr>
{% for section in grade_sections %}
{% assign challenge_total = challenge_total | plus: section[include.grade] %}
<tr >
    <td>{{ section.name }}</td>
    <td>{{ section[include.grade] }}</td>
</tr>
{% endfor %}
<tr>
    <th style="text-align: right;">Total:</th>
    <td>{{ challenge_total }}</td>
</tr>
</table><br />