---
layout: default
---
<h3>Problem {{ page.id | remove: '/problems/' | plus: 0 }}</h3>
<h1 class="post-title">{{ page.title }}</h1>
{{ page.content }}

{% include problem-bottom-nav.md %}

{% if page.pbd %}
    {% include pbd-credit.md %}
{% endif %}