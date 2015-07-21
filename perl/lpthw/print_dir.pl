#!C:/Strawberry/perl/bin/perl.exe

use strict;
use warnings;

sub list_files
{
	my ($dir) = @_;
	my @files = glob "$dir/*";
	foreach my $file (@files)
	{
		print "$file\n";
	}
}

sub print_dir
{
	my (@dirs) = @_;
	foreach my $dir (@dirs)
	{
		&list_files($dir);
	}
}

&print_dir(@ARGV);

