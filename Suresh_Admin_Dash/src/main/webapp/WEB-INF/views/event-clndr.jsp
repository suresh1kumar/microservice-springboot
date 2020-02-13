<%@ include file="header_script.jsp"%>



<%@ include file="header_nave_bar.jsp"%>






<div class="pcoded-content">
<div class="pcoded-inner-content">
<div class="main-body">
<div class="page-wrapper">
<div class="page-header">
<div class="page-header-title">
<h4>CLNDR </h4>
<span>A jQuery Calendar Plugin</span>
</div>
<div class="page-header-breadcrumb">
<ul class="breadcrumb-title">
<li class="breadcrumb-item">
<a href="index-2.html">
<i class="icofont icofont-home"></i>
</a>
</li>
<li class="breadcrumb-item"><a href="#!">Event Calendar</a>
</li>
<li class="breadcrumb-item"><a href="#!">CLNDR</a>
</li>
</ul>
</div>
</div>
<div class="page-body">
<div class="row">
<div class="col-sm-12">
<div class="card">
<div class="card-header">
<h5>Default calendar</h5>
<span>This is the most basic eample with html template and events to be shown on the calendar.</span>
<div class="card-header-right">
<i class="icofont icofont-rounded-down"></i>
<i class="icofont icofont-refresh"></i>
<i class="icofont icofont-close-circled"></i>
</div>
</div>
<div class="card-block">
<div class="row">
<div class="col-lg-6">
<div id="clndr-default" class="overflow-hidden bg-grey bg-lighten-3"></div>
</div>
<div class="col-lg-6">
<div>
<p class="f-14 f-w-600">Example markup:</p>
<pre><code class="language-markup">
                                              &lt;div id=&quot;clndr-default&quot;&gt;&lt;/div&gt;
                                </code></pre>
</div>
<div>
<p class="f-14 f-w-600">JS code example:</p>
<pre><code class="language-markup">
                               $('#calendar').clndr({
  template: $('#clndr-default').html(),
  events: [
    { date: '2017-04-10', title: 'Robot war', location: 'Center of Science' }
  ]
  });
                                 </code></pre>
</div>
</div>
</div>
</div>
</div>
</div>
<div class="col-sm-12">
<div class="card">
<div class="card-header">
<h5>Options in CLNDR</h5>
<span>Available options in CLNDR plugins and their exaples</span>
<div class="card-header-right">
<i class="icofont icofont-rounded-down"></i>
<i class="icofont icofont-refresh"></i>
<i class="icofont icofont-close-circled"></i>
</div>
</div>
<div class="card-block">
<div class="row">
<div class="col-sm-6">
<div class="card">
<div class="card-header">
<h5>Adjacent Month and day</h5>
<span>These two options are used to show show and change months showAdjacentMonths and adjacentDaysChangeMonth. Edges of other months should be visible and clicking them should switch the month.</span>
<div class="card-header-right">
<i class="icofont icofont-rounded-down"></i>
<i class="icofont icofont-refresh"></i>
<i class="icofont icofont-close-circled"></i>
</div>
</div>
<div class="card-block">
<div id="clndr-adjacent" class="overflow-hidden bg-grey bg-lighten-3"></div>
</div>
</div>
</div>
<div class="col-sm-6">
<div class="card">
<div class="card-header">
<h5>Multiday Event</h5>
<span>This example demonstrates multi-day events (12th - 17th, 24th - 27th).</span>
<div class="card-header-right">
<i class="icofont icofont-rounded-down"></i>
<i class="icofont icofont-refresh"></i>
<i class="icofont icofont-close-circled"></i>
</div>
</div>
<div class="card-block">
<div id="clndr-multiday" class="overflow-hidden bg-grey bg-lighten-3"></div>
</div>
</div>
</div>
</div>
<div class="row">
<div class="col-sm-6">
<div class="card">
<div class="card-header">
<h5>Constraints</h5>
<span>This example demonstrates start and end constraints. (the 4th of this month to the 24th of this month).</span>
<div class="card-header-right">
<i class="icofont icofont-rounded-down"></i>
<i class="icofont icofont-refresh"></i>
<i class="icofont icofont-close-circled"></i>
</div>
</div>
<div class="card-block">
<div id="clndr-constraints" class="overflow-hidden bg-grey bg-lighten-3"></div>
</div>
</div>
</div>
<div class="col-sm-6">
<div class="card">
<div class="card-header">
<h5>Six Rows calendar</h5>
<span>The forceSixRows option, which should make a six-row calendar regardless of the length of each month.</span>
<div class="card-header-right">
<i class="icofont icofont-rounded-down"></i>
<i class="icofont icofont-refresh"></i>
<i class="icofont icofont-close-circled"></i>
</div>
</div>
<div class="card-block">
<div id="clndr-six-rows" class="overflow-hidden bg-grey bg-lighten-3"></div>
</div>
</div>
</div>
</div>
<div class="row">
<div class="col-sm-6">
<div class="card">
<div class="card-header">
<h5>Selected Date</h5>
<span>It Should highlight the last date you clicked on.</span>
<div class="card-header-right">
<i class="icofont icofont-rounded-down"></i>
<i class="icofont icofont-refresh"></i>
<i class="icofont icofont-close-circled"></i>
</div>
</div>
<div class="card-block">
<div id="clndr-selected-date" class="overflow-hidden bg-grey bg-lighten-3"></div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div id="clndr" class="clearfix">
<script type="text/template" id="clndr-template">
                        <div class="clndr-controls">
                            <div class="clndr-previous-button">&lt;</div>
                            <div class="clndr-next-button">&gt;</div>
                            <div class="current-month">
                                <%= month %>
                                    <%= year %>
                            </div>
                        </div>
                        <div class="clndr-grid">
                            <div class="days-of-the-week clearfix">
                                <% _.each(daysOfTheWeek, function(day) { %>
                                    <div class="header-day">
                                        <%= day %>
                                    </div>
                                    <% }); %>
                            </div>
                            <div class="days">
                                <% _.each(days, function(day) { %>
                                    <div class="<%= day.classes %>" id="<%= day.id %>"><span class="day-number"><%= day.day %></span></div>
                                    <% }); %>
                            </div>
                        </div>
                        <div class="event-listing">
                            <div class="event-listing-title">Event this month</div>
                            <% _.each(eventsThisMonth, function(event) { %>
                                <div class="event-item font-small-3">
                                    <div class="event-item-day font-small-2">
                                        <%= event.date %>
                                    </div>
                                    <div class="event-item-name text-bold-600">
                                        <%= event.title %>
                                    </div>
                                    <div class="event-item-location">
                                        <%= event.location %>
                                    </div>
                                </div>
                                <% }); %>
                        </div>
                    </script>
</div>
</div>
</div>
</div>
<div id="styleSelector">
</div>
</div>
</div>



















<%@ include file="footer_nave_bar.jsp"%>