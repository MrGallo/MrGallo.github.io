<hr>
{% assign previous = site.problems[page.number].previous %}
{% if previous %}
  <a href="{{ previous.permalink }}" style="float:left;">&#9668; {{previous.number}}: {{ previous.title }}</a>
{% endif %}

{% assign next = site.problems[page.number].next %}
{% if next %}
  <a href="{{ next.permalink }}" style="float:right;">{{next.number}}: {{ next.title }} &#9658;</a>
{% endif %}
<br><br>