#!/bin/sed -nf

# lancement sed -nf make2xml.sed makefile >makefile.xml

1i\
<make>

:d
/\\$/{
	s/[ 	]*\\$//
	N
	s/\n[ 	]*/ /
	bd
#	s/.*/"&"/
}

# Get rid of comments
s/#\(.*\)$/	<comment>\1<\/comment>/	p


/^[a-zA-Z_][a-zA-Z0-9_]*[ 	]*=/{
	s/^\([a-zA-Z_][a-zA-Z0-9_]*\)[ 	]*=[ 	]*\(.*[A-Za-z0-9)]\)[ 	]*$/	<macro name="\1" value="\2"\/>/	p
}

#rule with dependencies
/^[A-Za-z][A-Za-z\.0-9]*[ 	]*:[ 	]*\([A-Za-z].*\)$/{
#	s/^\([A-Za-z][A-Za-z\.0-9]*\)[:space:]*:[ 	]*\(.*[A-Za-z0-9)]\)[ 	]*$/	<rule name="\1">\n		<dependencies>\2<\/dependencies>/
	s/^\([A-Za-z][A-Za-z\.0-9]*\)[ 	]*:[ 	]*\(.*[A-Za-z0-9)]\)[ 	]*$/	<rule name="\1" depends="\2">/
	p
	n
	:s
	/^	/{
		s/^	//
		s/\(.*[A-Za-z0-9)]\)[ 	]*$/		<shellLine>\1<\/shellLine>/
		p
		n
		bs
	}
	a\
	</rule>
}

#rule without dependencies
/^[A-Za-z][A-Za-z\.0-9]*[ 	]*:[ 	]$/{
#	s/^\([A-Za-z][A-Za-z\.0-9]*\)[:space:]*:[ 	]*\(.*[A-Za-z0-9)]\)[ 	]*$/	<rule name="\1">\n		<dependencies>\2<\/dependencies>/
	s/^\([A-Za-z][A-Za-z\.0-9]*\)[ 	]*:[ 	]*$/	<rule name="\1">/
	p
	n
	:s
	/^	/{
		s/^	//
		s/\(.*[A-Za-z0-9)]\)[ 	]*$/		<shellLine>\1<\/shellLine>/
		p
		n
		bs
	}
	a\
	</rule>
}


$a\
</make>