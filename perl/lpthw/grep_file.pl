#!C:/Strawberry/perl/bin/perl.exe

use strict;
use warnings;

sub grep_file
{
	my ($pat, $file) = @_;
	open FILE, '<', $file || die "Unable to open file $file";

	for(<FILE>)
	{
		print $_ if $_ =~ m/$pat/;
	}
}

&grep_file(@ARGV);
