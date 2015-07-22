#!C:/Strawberry/perl/bin/perl.exe

use strict;
use warnings;

sub grep_file
{
	my ($pat, $file) = @_;
	open FILE, '<', $file || die "Unable to open file $file";

	for(<FILE>)
	{
		print "$file:$_" if (($_ =~ m/$pat/) && (! -d $file));
	}
}

sub grep_files
{
	my ($pat, @file_patterns) = @_;
	
	foreach my $file_pat (@file_patterns)
	{
		foreach my $file (glob("$file_pat"))
		{
			&grep_file($pat, $file);
		}
	}
}

&grep_files(@ARGV);

# Find all words beginning with a or b and ending with a or b.
# ./grep.pl ^[ab].*[ab]$ ../corncob_lowercase.txt
# Find all words beginning with a and ending with a or beginning with b and ending with b.
# ./grep.pl "^(a.*a|b.*b)$" ../corncob_lowercase.txt
# ./grep.pl "(^a.*a$|^b.*b$)" ../corncob_lowercase.txt
# Find all the words that begin with "un" or "in" and have exactly 17 characters
# ./grep.pl ^[ui]n.{15}$ ../corncob_lowercase.txt
# Find all the words that begin with "un" or "in" or "non" and have more than 17 characters
# ./grep.pl "^((un|in).{16}|(non.{15}))" ../corncob_lowercase.txt
# Find all the words that begin and end with the same character
# ./grep.pl "^(.).*(\1)$" ../corncob_lowercase.txt
