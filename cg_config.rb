require 'coursegen'

# bucket for AWS Deployment of the course
AWS_BUCKET = "cosi12b"

# Local directory path for directory of content
CONTENT_PATH = "/mydev/cosi12b"

# Copyright string
COPYRIGHT_STRING = "Copyright (2013-2019) R. Pito Salas, pitosalas@brandeis.edu"

# Course short name
COURSE_SHORT_NAME = "Cosi12b"
COURSE_LONG_NAME = "Advanced Programming Techniques (2019)"
COURSE_ABBREV = "12b"

# Sections in the right hand margin of the page
SECTION_CONFIG = [
  SectionDef.new("Resources", "resources", hidden: false, type: :section),
  SectionDef.new("Extras", "extras", hidden: true, type: :section),
  SectionDef.new("Topics", "topics", hidden: true, type: :section)
]
# Options are:
# bullet_style: css style for each bullet
STYLING_CONFIG = {bullet_style: "\"font-size: 60%; width: 10px; color: grey\""}
HELPFUL_BOX = false
HOME_PAGE = "/content/resources/00_syllabus.md.erb"
